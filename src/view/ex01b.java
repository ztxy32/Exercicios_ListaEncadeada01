package view;

import model.Lista;

public class ex01b {
    public static void main(String[] args) {
        Lista<Integer> l = new Lista<>();
        try{
            for(int i = 100; i < 115; i++){
                if(l.isEmpty()){
                    l.addFirst(i+100);
                }else if(l.size() <= 4){
                    l.addLast(i+50);
                }else{
                    System.out.println(l.getPosicao(0));
                    l.removeFirst();
                }
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }

        System.out.println(l.size());
        System.out.println(l);
    }
}
