## Exercicio de Android

### Jogo dos dados

- Usamos o [iconfinder](https://www.iconfinder.com/) para baixar as imagens dos dados

Criei uma classe(`Dado.java`) separada para as lógicas dos dados sendo jogados: 

``` java
public class Dado {

    private int numero;

    public Dado(){
        this.setNumero(1);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero > 0 && numero < 7){
            this.numero = numero;
        } else {
            this.numero = 1;
        }
    }

    public void JogarDado(){
        Random gerador = new Random();
        this.setNumero(gerador.nextInt(6)+1);
    }
}
```

- Atribuimos a imagem do dado no arquivo `activity_main.xml`:

``` xml
<ImageView
    android:layout_width="100dp"
    android:layout_height="100dp"
    android:layout_gravity="center_horizontal"
    android:src="@drawable/questionmark"
    android:id="@+id/dado-1"/>
```

Já no `MainActivity.java` extraimos a `View` do ID passado no `activity_main.xml`: 

``` java
    primeiroDado = findViewById(R.id.dado_1);
``` 

Criamos uma variável chamada `img` que vai receber a imagem do novo dado: 

``` java
    ImageView img1 = (ImageView)findViewById(R.id.dado_1);
```

Instanciamos os dois dados e chamamos o método que faz o jogo: 

``` java
    Dado dado1 = new Dado();
    Dado dado2 = new Dado();
    dado1.JogarDado();
    dado2.JogarDado();
```

Atribuimos a imagem dos dados de acordo com o retorno do jogo: 

``` java
    if (dado1.getNumero() == 1) img1.setImageResource(R.drawable.dice1);
```

Finalmente criamos uma validação para saber qual dos jogadores ganhou a partida: 

``` java
    if (dado1.getNumero() > dado2.getNumero()) {
            Toast.makeText(this,"Jogador 1 venceu!",1). show();
        } else {
            Toast.makeText(this,"Jogador 2 venceu!",1). show();
        }
```