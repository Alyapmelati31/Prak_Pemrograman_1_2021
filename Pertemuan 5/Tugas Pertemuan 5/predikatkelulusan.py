ipk = input("Masukan IPK Anda = ")
ipk = float(ipk)
lamastudi = input("Masukan lama studi = ")
lamastudi = float(lamastudi)
if (ipk >= 3.51 and ipk <=4 and lamastudi <=4):
    print("Selamat Anda Meraih Predikat Summa Cumlaude")
elif (ipk >= 3.51 and ipk <=4 and lamastudi > 4):
    print("Selamat Anda Meraih Predikat Cumlaude")
elif (ipk >= 3.01 and ipk < 3.51):
    print("IPK Anda Sangat Memuaskan")
elif (ipk >= 2.76 and ipk < 3.01):
    print("IPK Anda Memuaskan")
elif (ipk >= 2.00 and ipk < 2.76):
    print("IPK Anda Cukup")
elif (ipk < 2.00):
    print("Anda Tidak Lulus")
else:
    print("Tidak Valid")

