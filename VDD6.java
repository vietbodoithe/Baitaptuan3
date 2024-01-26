/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan3;

/**
 *
 * @author viethayho
 */
public class VDD6 {
    private final Object monitor=new Object();
    private boolean isDataReady=false;
    public void productData() throws InterruptedException
    {
        synchronized (monitor) {
            //dam bao co 1 tien trinh thuc hien
            while (isDataReady){
                monitor.wait();
            }
        
        Thread.sleep(2000);
        isDataReady=true;
        monitor.notify();
        }
    }
    // ham 
    public void useData() throws InterruptedException
    {
        synchronized (monitor) {
            // dam bao chi co 1 tien trinh thuc hien
            while (!isDataReady) {                
                monitor.wait();
            }
        
        //neu da ss thi su dung
        System.out.println("Su dung du lieu ...");
        Thread.sleep(3000);
        isDataReady=false;
        monitor.notify();
        }
    }
    public static void main(String[] args) {
        VDD6 ex=new VDD6();
        Thread thSanXuat = new Thread(()-> {
            try {
                while (true){
                    ex.productData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread thSuDung = new Thread(()-> {
            try {
                while (true){
                    ex.useData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thSanXuat.start();
        thSuDung.start();
        
    }
}