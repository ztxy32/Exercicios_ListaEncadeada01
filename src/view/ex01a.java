package view;

import model.Lista;

public class ex01a {
    public static void main(String[] args) {
        Lista<Integer> l = new Lista<>();
        try{
            for(int i = 0; i < 10; i++){
                if(i % 2 == 0){
                    l.addFirst(i*i);
                }else if(i <= 6){
                    l.addFirst(i);
                }else{
                    System.out.println(l.getPosicao(l.size() - 1));
                    l.removeLast();
                }
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }

        System.out.println(l.size());
        System.out.println(l);
    }
}
