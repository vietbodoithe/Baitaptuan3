/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan3;

/**
 *
 * @author viethayho
 */
public class VDD5 {
    private final Object monitor = new Object();
    public void waitForSignal() throws InterruptedException
    {
        synchronized (monitor) {
            monitor.wait();
        }
    }
    public void notifySignal()
    {
        synchronized (monitor) {
            monitor.notify();
        }
    }
}