/**
 *
 * @author Fenias
 */
import java.util.*;
import java.io.*;

public class SistemaAluno {
    
    Vector <Aluno>x=new Vector();
    
        public void lerDados(){
            
            Scanner  t=new Scanner(System.in);
            Aluno h;
            int code;
            
            do{System.out.println("INTRODUZA O CODIGO: ");
               code=t.nextInt();
               if(code>0){
                   h=new Aluno();
                   h.setcodigo(code);
                   System.out.println("INTRODUZA O NOME:  ");
                   h.setnome(t.next());
                   System.out.println("INTRODUZA O teste1:  ");
                   h.setteste1(t.nextDouble());
                   System.out.println("INTRODUZA O teste2:  ");
                   h.setteste2(t.nextDouble());
                   x.addElement(h);
                   System.out.println("Atribuicao feita com SUCESSO");
                   System.out.println();
               }
            }while(code>0);
        }
        public void imprimeTodos(){
        
            Aluno j = null;
            int code;
     
                for(int i=0;i<x.size();i++){
                    j=x.get(i);
                    System.out.println("O CODIGO:   "+j.getcodigo());
                    System.out.println("O NOME:  "+j.getnome());
                    System.out.println("O TESTE1:  "+j.getteste1());
                    System.out.println("O TESTE2:  "+j.getteste2());
                }    
        }
        public void imprimeUmAluno(){
            Scanner t=new Scanner(System.in);
             Aluno s=null;
            int code;
            
            System.out.println("INTRODUZA A CATEGORIA:   ");
                code=t.nextInt();
                for(int i=0;i<x.size();i++){
                    if(x.get(i).getcodigo()==code){
                    System.out.println("O CODIGO:   "+s.getcodigo());
                    System.out.println("O NOME:  "+s.getnome());
                    System.out.println("O TESTE1:  "+s.getteste1());
                    System.out.println("O TESTE2:  "+s.getteste2());
                    }
                }    
        }
        public void actualizaAluno(){
            
            Scanner  t=new Scanner(System.in);
            Aluno d=null;
            
            System.out.println("INTRODUZA O CODIGO: ");
              int code=t.nextInt();
            
            for(int i=0;i<x.size();i++){
                if(x.get(i).getcodigo()==code){
                   System.out.println("INTRODUZA O NOME:  ");
                   d.setcodigo(t.nextInt());
                   System.out.println("INTRODUZA O Teste1:  ");
                   d.setteste1(t.nextDouble());
                   System.out.println("INTRODUZA O TESTE2:  ");
                   d.setteste2(t.nextDouble());
                   x.setElementAt(d,i);
                    System.out.println("Actualizacao feita com sucesso");
                }
            }    
        }
        public void apagaAluno(){
            
        }
}
