package view;
import model.Lista;

public class ex03a {
    public static void main(String[] args) {
        Lista<Integer> l = new Lista<>();
        try{
            l.addFirst(3);
            l.addLast(5);
            l.addLast(18);
            l.addLast(12);
            l.addLast(9);
            l.addLast(7);
            l.addLast(6);
            l.addLast(2);
            l.addLast(13);
            l.addLast(4);
            l.addLast(16);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(l);
        for(int i = 0; i < l.size(); i++){
            try{
                l.add(l.getPosicao(l.size()-1), i);
                l.removeLast();
                
            }catch(Exception e ){e.printStackTrace();}
        }
        
        System.out.println(l);
    }
}