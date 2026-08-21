package flamingo.apredendo.basico;

public class EstruturaCondicionaisParte02 {
    public static void main(String[] args) {

//        byte idade = 17;
//
//        if (idade >= 18) {
//            System.out.println("Pode comprar bebida alcoólica");
//        }else {
//            System.out.println("Não comprar bebida alcoólica");
//
//        }
        byte idade = 16;
        String categoria;

        // < 15 - infantil
        // >= 15 && < 18 - juvenil
        // >= 18

        if(idade < 15) {
            categoria = "Categoria Infantil";
        }else if ( idade <18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
      }
    }


