/**
 *
 * @author Fenias
 */
public class Aluno {
    private int codigo;
    private String nome;
    private double teste1;
    private double teste2;
    
        public Aluno(){
            this.codigo=0;
            this.nome="  ";
            this.teste1=0.0;
            this.teste2=0.0;
        }
        public void setcodigo(int codigo){
            this.codigo=codigo;
        }
        public int getcodigo(){
            return this.codigo;
        }
        public void setnome(String nome){
            this.nome=nome;
        }
        public String getnome(){
            return this.nome;
        }
        public void setteste1(double teste1){
            this.teste1=teste1;
        }
        public double getteste1(){
            return this.teste1;
        }
        public void setteste2(double teste2){
            this.teste2=teste2;
        }
        public double getteste2(){
           return this.teste2; 
        }
        public double getMedia(){
            double m=(teste1+teste2)/2;
            return m;
        }
    @Override
        public  String toString(){
          String y;
          y="\n CODIGO: "+codigo+
            "\n NOME: "+nome+
            "\n TESTE1: "+teste1+
            "\n Teste2: "+teste2+
            "\n MEDIA: "+getMedia()+
            "\n CLASSIF: "+getClassif();      
          return y;
        }
        public String getClassif(){
            String z= "Admitido";
                if(getMedia()>=14){
                    z= "Dispensado";
                }else{if(getMedia()<10){
                    z= "Excluido";
                    }
                }
                return z;
        }
}
