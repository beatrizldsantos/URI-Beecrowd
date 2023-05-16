while True:
    try:
        n, l, c = map(int, input().split()) # número de palavras, linhas por página e caracteres por linha
        palavras = input().split() # lista de palavras
    except EOFError:
        break

    num_paginas = 1
    num_linhas = 1
    num_caracteres = 0

    for palavra in palavras:
        tamanho_palavra = len(palavra)

        if num_caracteres == 0:
            # primeira palavra da linha
            num_caracteres = tamanho_palavra
        else:
            # já existe pelo menos uma palavra na linha
            num_caracteres += tamanho_palavra + 1 # considerar um espaço entre as palavras

        if num_caracteres > c:
            # a palavra atual não cabe na linha, começa uma nova linha
            num_linhas += 1
            num_caracteres = tamanho_palavra

            if num_linhas > l:
                # a nova linha não cabe na página, começa uma nova página
                num_paginas += 1
                num_linhas = 1
    print(num_paginas)
