/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shashi
 */
public class BackupRestoreController {

    public static void backUp(String path) {
        try {
            String dbName = "dakma";
            String dbUser = "root";
            String dbPass = "shashi";

            String executeCmd = "mysqldump -u " + dbUser + " -p" + dbPass
                    + " --add-drop-database -B " + dbName + " -r " + path;

//            Process runtimeProcess = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/C", "mysqldump", "-u " + dbUser + " -p" + dbPass
//                        + " --add-drop-database -B " + dbName + " -r " + path});
//            int processComplete = runtimeProcess.waitFor();

            ProcessBuilder builder = new ProcessBuilder(executeCmd);
            int processComplete = builder.start().waitFor();
            if (processComplete == 0) {
                System.out.println("Backup Complete");
                JOptionPane.showMessageDialog(null, "Backup Complete");
            } else {
                System.out.println("Backup Failure");
            }

        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Error at Backuprestore" + ex.getMessage());
        }
    }

    public static void restoreBackup(String dbName, String dbUserName, String dbPassword, String path) throws IOException, InterruptedException {
        String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, dbName, "-e", " source " + path};
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int processComplete = runtimeProcess.waitFor();

        if (processComplete == 0) {
            JOptionPane.showMessageDialog(null, "Restore Complete");
        } else {
            JOptionPane.showMessageDialog(null, "Restore Faild");
        }
    }
}
