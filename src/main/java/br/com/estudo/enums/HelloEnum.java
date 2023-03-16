package br.com.estudo.enums;

public enum HelloEnum {
    INDEFINIDO(0),
    DESENHO_INDUSTRIAL(100),
    PATENTES(200),
    MARCAS(300),
    CONTRATOS(400),
    TOPOGRAFIA(650),
    INDICACAO_GEOGRAFICA(600),
    PROGRAMA(700),
    ADMINISTRACAO(800);

    private final Integer codigo;

    HelloEnum(Integer codigo) {
        this.codigo = codigo;
    }
}
