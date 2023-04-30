contador = 0  # inicializa o contador de valores positivos

for i in range(6):
    valor = float(input())  # lê um valor do usuário
    if valor > 0:
        contador += 1  # incrementa o contador se o valor for positivo

print(f"{contador} valores positivos")  # exibe a quantidade de valores positivos
