/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author ASUS
 */
public class Stack {
    //deklarasi variable yang akan dipakai
    private boolean empty,full;
    private int pos;
    private int max_data=5;
    private int item[]=new int [max_data];
    public void stack (){
        full=false;
        empty=true;
        pos=0;
        
}
    public boolean isFull(){
        return full;
    }
    public boolean isEmpty(){
        return empty;
    }
    
    //source kode untuk melakukan penambahan data atau PUSH
    public void push(int data){
        if(!isFull()){
            item[pos++]=data;
            empty=false;
            if(pos==max_data){
            full=true;
        }
            System.out.println("data sudah ditambah");
            System.out.println("============================================");
    }else{
            System.out.println("Stack sudah penuh");
        }
        return;
   
    
}
    
    //source kode untuk POP atau pengambilan data ter atas
    public int pop(){
        int x=0;
        if(!isEmpty()){
            x=item[--pos];
            full=false;
            System.out.println("Data yang anda pop adalah "+item[pos]);
            System.out.println("");
            item[pos]=0;
            if(pos==0){
                empty=true;
                System.out.println("Stack adalah kososng");
            }else{
                System.out.println("Data sudah diambil");
            }
        }else{
            System.out.println("stack masih kosong ! \n");
        }
        return(x);
    }
    
    //source kode untuk menampilkan tumpukan data yang terurut
    public void display(){
        System.out.println("Isi stack adalah");
        for (int i = pos-1; i >= 0; i--){
            System.out.println(item[i]+"");
        }
            System.out.println("\n");
        }
}
