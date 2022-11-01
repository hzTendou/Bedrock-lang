# Bedrock-lang
This is my own programming language old version.

# Little example codes 
1:
```
class Main() {
    color=BLUE
    print('Hosgeldin!')
    print('----------------------------')
    int input not1='1. notunu gir: '
    int input not2='2. notunu gir: '
    int input not3='3. notunu gir: '
    int data islem1=m$(i$not1 + i$not2)
    int data islem2=m$(i$islem1 + i$not3)
    int data toplam=m$(i$islem2 / 3)
    if(i$toplam > 50) {
        color=GREEN
        print('Notun iyi!')
        print('Notun >> ':i$toplam)
    }
    else {
        color=RED
        print('Notun kötü!')
        print('Notun >> ':i$toplam)
    }
}
```
2:
```
class Main() {
    color=BLUE
    print('Welcome to AdminPanel')
    print('---------------------------------------')
    string data username='Tendou'
    string data password='supersecretpass'
    string input usernameinput='Username: '
    string input passwordinput='Password: '
    if(s$username == s$usernameinput && s$password == s$passwordinput) {
	color=GREEN
	print('Login Succesful')
	print('Welcome ':s$usernameinput:'!')
    }	
    else {
	color=RED
	print('Error!')
	print('Username or password wrong')
	}
}
```
