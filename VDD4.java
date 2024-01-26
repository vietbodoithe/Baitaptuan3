/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan3;

/**
 *
 * @author viethayho
 */
public class VDD4 {
    private final Object lc=new Object();
    public synchronized void phuongThuc1()
    {
        
    }
    public synchronized void phuongThuc2()
    {
        synchronized (lc) 
        {
            
        }
    }
    public static void main(String[] args) {
        Thread th=new Thread(()->{
            
        });
        th.start();
        try {
            th.join();
        } catch (Exception e) {
        }
    }
}