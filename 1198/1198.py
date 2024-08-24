leitura = input()
while leitura != 'EOF':
    leitura = leitura.split(" ")
    print(abs(int(leitura[0])-int(leitura[1])))
    try:
        leitura = input()
    except EOFError:
        leitura = "EOF"