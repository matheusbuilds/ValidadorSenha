import java.util.Scanner;
import javax.swing.*;

public class ValidadorSenha {
    public static void main(String[] args){
        while (true) {
        String senha = JOptionPane.showInputDialog(null, "Digite sua senha:", "Validador de Senha", JOptionPane.PLAIN_MESSAGE);

        if (senha == null) {
            JOptionPane.showMessageDialog(null, "Operação Cancelada.");
            break;
        }

        if (validarSenha(senha)) {
            JOptionPane.showMessageDialog(null,"Senha Aceita!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            break;
        } else {
            JOptionPane.showMessageDialog(null,"Senha inválida!\nA senha deve ter no mínimo 8 caracteres,\ncom letras maiúsculas, minúsculas, números e símbolos.",
            "Erro",
            JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static boolean validarSenha(String senha){
        if (senha.length() < 8){
            return false;
        }

        boolean letraMaiuscula = false;
        boolean letraMinuscula = false;
        boolean caracterEspecial = false;
        boolean digito = false;

        for (char c : senha.toCharArray()){
            if(Character.isUpperCase(c)){
                letraMaiuscula = true;
            } else if (Character.isLowerCase(c)){
                letraMinuscula = true;
            } else if (Character.isDigit(c)){
                digito = true;
            } else if (!Character.isLetterOrDigit(c)){
                caracterEspecial = true;
            }
        }

        return (letraMaiuscula && letraMinuscula && digito && caracterEspecial);
    }
}