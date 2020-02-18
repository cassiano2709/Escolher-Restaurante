package votacao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javafx.scene.chart.PieChart.Data;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.runtime.Debug.id;

public class App {

    public static void main(String[] args) {
        
        Date d = new Date();
        
        System.out.println(d.toString());
        
        Calendar c = Calendar.getInstance();
        
        c.setTime(d);
        
        c.add(c.DAY_OF_MONTH, 2);
        
        if(c.SUNDAY == c.get(c.DAY_OF_WEEK))
            
            System.out.println("DOMINGO");
        
        if(c.MONDAY == c.get(c.DAY_OF_WEEK))
            
            System.out.println("SEGUNDA");
        
         if(c.TUESDAY == c.get(c.DAY_OF_WEEK))
             
             System.out.println("TERÇA");
         
         if(c.WEDNESDAY == c.get(c.DAY_OF_WEEK))
             
             System.out.println("QUARTA");
         
         if(c.THURSDAY == c.get(c.DAY_OF_WEEK))
             
             System.out.println("QUINTA");
        
        if(c.FRIDAY == c.get(c.DAY_OF_WEEK))
             
             System.out.println("SEXTA");
        
        
        
        ArrayList<Participante> part = new ArrayList<>();             
        ArrayList<String> rest = new ArrayList<>();
        
        rest.add("Silva - OPÇAO[1]");
        rest.add("Palattus - OPÇAO[2]");
        rest.add("Panorama - OPÇAO[3]");
        rest.add("Sabor familia - OPÇAO[4]");
        rest.add("Bar32 - OPÇAO[5]");
        
        System.out.println("\nLISTA DE RESTAURANTES:" + rest.toString());
    
        System.out.println("ADICIONAR PARTICIPANTES!");
       
        System.out.println("\nParticipates");
        
        Scanner ler = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        for(int i=0; i<2;i++){
        System.out.println("DIGITE SEUS DADOS: " + "\nNome:  ");
        String nome = ler.nextLine();
        System.out.println("\nNome: " + nome);
        System.out.println("\nDigite ID: "  );
        String id = ler.nextLine();
        
           
            lista.add("\nNome: " +nome+ " : " + "\nID: " + id);
        }
        System.out.println(lista.toString());
        
        for(Iterator iterator = lista.iterator();iterator.hasNext();){
       String string = (String) iterator.next();
        }
        //String n;
        //n = ler.next(); 
       System.out.println("--------------------------------------------------------------------------------------------");
       
       System.out.println("CRIAR VOTAÇÃO!");
       
       //System.out.println("ESCOLHA O RESTAURANTE:");
            
               
        int sair = 1;
        int s = 0;
        int p = 0;
        int pt = 0;
        int sf = 0;
        int br = 0;    
        
      Scanner  escolha = new Scanner(System.in);
      System.out.println("VOTAR NO RESTAURANTE FAVORITO");
      System.out.println("Silva - OPÇAO [1]");
      System.out.println("Panorama - OPÇAO [2]");
      System.out.println("Palattus - OPÇAO [3]");
      System.out.println("Sabor familia - OPÇAO [4]");
      System.out.println("Bar 32 - OPÇAO [5]");
      
          

        while (sair != 0) {
            System.out.println("Qual seu restaurante?");

            int voto = ler.nextInt();
            if (voto == 1) {
                System.out.println("Silva Lanches");
                s += 1;
            }

            else if (voto == 2) {
                System.out.println("Panorama");
                p += 1;
            }

            if (voto == 3) {
                System.out.println("Palattus");
                pt += 1;
            }
            
            if (voto == 4) {
                System.out.println("Sabor Familia");
                sf += 1;
            }
             
             if (voto == 5) {
                System.out.println("Bar 32");
                br += 1;
            }
             if (voto > 5) {
                System.out.println("As opções são 1 - 2 - 3 - 4 - 5 esse número não existe");
            }

            if (voto == 0) {
                sair = voto;
                int maiorValor = 0;
                int totalVotos = s + p + pt + sf + br;
                System.out.println("Contagem dos votos");
                System.out.println("Total dos votos: " + totalVotos);
                System.out.println("Silva Lanches : " + s);
                System.out.println("Panorama : " + p);
                System.out.println("Palattus : " + pt);
                System.out.println("Sabor Familia : " + sf);
                System.out.println("Bar 32 : " + br);
                
                
                if (s > p || s > pt || s > sf || s > br) {
                    System.out.println("Restaurante vencedor recebeu: " + s + " ( " + "Silva Lanches ) ");
                    int maiorValorS = s;
                    System.out.println("Maior Silva : " + maiorValorS);
                    
                }else
                if (p > s || p > pt || p > sf || p > br) {
                    System.out.println("Restaurante vencedor recebeu: " + p + " ( " + "Panorama ) ");
                      int maiorValorP = p;
                      System.out.println("Maior Panorama : " + maiorValorP);
                }else
                if (pt > p || pt > s || pt > sf || pt > br) {
                    System.out.println("Restaurante vencedor recebeu: " + pt + " ( " + "Palattus ) ");
                    int maiorValorPt = pt;
                    System.out.println("Maior Palattus : " + maiorValorPt);
                } else               
                if (sf > p || sf > pt || sf > p || sf > br) {
                    System.out.println("Restaurante vencedor recebeu: " + sf + " ( " + "Sabor Familia ) ");
                     int  maiorValorSf = sf;
                     System.out.println("Maior Sabor Familia : " + maiorValorSf);
                } else
                
                if (br > p || br > pt || br > sf || br > s) {
                    System.out.println("Restaurante vencedor recebeu: " + br + " ( " + "Bar 32 ) ");
                      int maiorValorBr = br;
                      System.out.println("Maior Bar 32 : " + maiorValorBr);
                } 
                
                else{
                    
                    System.out.println("EMPATE");
                    
                }
                                  
                
                break;
            }
        }
    }
    
}

        
        
        
       
        
    
    

