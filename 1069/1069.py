rodadas = int(input())
for i in range(0,rodadas):
    teste = input()
    diamonds = 0
    pilha = 0
    for j in range(len(teste)):
        if teste[j]=="<":
            pilha = pilha + 1
        elif teste[j] == ">" and pilha >= 1:
            diamonds = diamonds + 1
            pilha = pilha - 1
    print(diamonds)