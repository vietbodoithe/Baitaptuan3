/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VDD2 {
    private int count=0;
    private Lock lc=new ReentrantLock(); //tao khoa
    public void demTang()
    {
        lc.lock();
        try {
            count++;
        } catch (Exception e) {
        }
        finally{
            lc.unlock(); //mo cac tien trinh khac
        }
    }
}

