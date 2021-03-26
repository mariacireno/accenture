# language: pt

Funcionalidade: Testar site Tornese
    Accenture QA Challenge 1 - testar site tornese buscando conteúdo tdd e bdd

    Cenário: Entrar no site do tornese um programador e buscar pelo conteúdo tdd
        Dado que que estou no site do tornese um programador
        E digito no campo de busca a palavra "tdd"
        E clico no botão da lupa
        Então devo ver o resultado na busca 'Busca pelo termo "tdd"'

    Cenário: Entrar no site do tornese um programador e buscar pelo conteúdo bdd
        Dado que que estou no site do tornese um programador
        E digito no campo de busca a palavra "bdd"
        E clico no botão da lupa
        Então devo ver o resultado na busca 'Busca pelo termo "bdd"'