/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import dakmainstitute.model.SMSSender;
import java.util.List;
import jssc.SerialPort;
import jssc.SerialPortException;

/**
 *
 * @author Shashi
 */
public class SMSSenderController {

    public static boolean send(String port, String no, String body) {

        boolean sent = false;
        SerialPort sp = null;
        body = "-   " + body;
        try {
            sp = new SerialPort(port);
            System.out.println("Port " + port);
            System.out.println("No " + no);
            System.out.println("Body " + body);
            sp.openPort();
            sp.setParams(9600, 8, 1, 0);
            String s = "AT+CMGF=1";
            writeMsg(sp, s);
            sp.writeInt(13);

            s = "AT+CMGS=\"" + no + "\"";
            writeMsg(sp, s);
            sp.writeInt(13);

            s = body;
            writeMsg(sp, s);
            sp.writeInt(0x1A);
            sp.writeInt(13);

            System.out.println("SMS Sent !!! " + s);
            sent = true;
        } catch (Exception ex) {
            sent = false;
            ex.printStackTrace();
        } finally {
            try {
                sp.closePort();
            } catch (Exception e) {
            }
        }
        return sent;
    }
    
    public static boolean sendAuto(String port, List<SMSSender> sms) {
        for (SMSSender sMSSender : sms) {
            String indexNo="Index No : "+sMSSender.getIndexNo();
            String test="Test : "+sMSSender.getTestId();
            String marks="Marks : "+sMSSender.getMarks();
            String rank="Rank : "+sMSSender.getRank();
            
            String body = indexNo+"\n"+test+"\n"+marks+"\n"+rank;
            String mobileNo = sMSSender.getContactNo();
            System.out.println(mobileNo);

            boolean sent = false;
            SerialPort sp = null;
            body = "-   " + body;
            try {
                sp = new SerialPort(port);
                System.out.println("Port " + port);
                System.out.println("No " + mobileNo);
                System.out.println("Body " + body);
                sp.openPort();
                sp.setParams(9600, 8, 1, 0);
                String s = "AT+CMGF=1";
                writeMsg(sp, s);
                sp.writeInt(13);

                s = "AT+CMGS=\"" + mobileNo + "\"";
                writeMsg(sp, s);
                sp.writeInt(13);

                s = body;
                writeMsg(sp, s);
                sp.writeInt(0x1A);
                sp.writeInt(13);

                System.out.println("SMS Sent !!! " + s);
                sent = true;
            } catch (Exception ex) {
                sent = false;
                ex.printStackTrace();
            } finally {
                try {
                    sp.closePort();
                } catch (Exception e) {
                }
            }
            return sent;
        }
        return false;

    }

    private static void writeMsg(SerialPort sp, String s) throws SerialPortException {
        char ch[] = s.toCharArray();
        for (int j = 0; j < ch.length; j++) {
            sp.writeInt((int) ch[j]);
        }
    }

}
