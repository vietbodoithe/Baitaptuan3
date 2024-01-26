/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan3;

public class VDD3 {
    private int count=0;
    // phuong thuc dong bo hoa
    public synchronized void increment(){
        count++;
    }
    // Phuong thuc dong bo hoa
    public synchronized void decrement()
    {
        count-=2;
    }
    public int getCount(){
        return count;
    }
    public static void main(String[] args){
        VDD3 counter = new VDD3();
        Thread incrementThread=new Thread(()->{
        for(int i=0;i<1000;i++){
            counter.increment();
        }
    });
         Thread decrementThread=new Thread(()->{
        for(int i=0;i<1000;i++){
            counter.decrement();
        }
    });
         incrementThread.start();
         decrementThread.start();
         try {
            //cho doi
            incrementThread.join();
            decrementThread.join();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         
         System.out.println("count cuoi cung: "+counter.getCount());
    }
}
