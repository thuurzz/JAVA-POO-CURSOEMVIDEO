package aula09;

public interface Publicacao {
    default void abrir(){}
    default void fechar(){}
    default void folhear(int p){}
    default void avancarPag(){}
    default void voltarPag(){}
}
