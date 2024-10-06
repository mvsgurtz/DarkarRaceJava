Faça os diagramas de classe correspondentes para cada etapa e aplique as alterações à medida que você passa pelos diferentes pontos.


Crie uma classe de veículo que tenha os seguintes atributos:
Velocidade
Aceleração
Ângulo de giro
Patente
Peso
Rodas

Modele a classe Career que tem os seguintes atributos:
Distância
PrêmioEmDólares
Nome do prêmio
Número de veículos permitidos
Lista de veículos

Queremos adicionar duas novas categorias de veículos:
Carros
Motos.
Os carros pesam 1.000 quilos e as motocicletas 300 quilos, os carros têm 4 rodas e as motocicletas têm 2.


Uma corrida também tem um conjunto de veículos que participarão da corrida. Portanto, agora a corrida terá a responsabilidade de adicionar um veículo, por isso precisamos definir os seguintes métodos:
public void darDeAltaCarro( velocidade, aceleração, ângulodegiro, patente);

public void darDeAltaMoto(velocidade, aceleração, ângulodegiro, patente);

Ambos os métodos adicionam um veículo, desde que haja espaço.


Também teremos a possibilidade de eliminar um veículo por dois métodos:
public void eliminarVeículo(veículo);

        public void eliminarVeículoComPatente(String umaPatente);


6. Queremos poder definir o ganhador de uma corida:

O vencedor será aquele com o maior valor determinado pela seguinte fórmula:

Velocidade * ½ Aceleração / (AnguloDeGiro*(Peso-Quantidade de Rodas * 100)


7. As corridas também têm veículos de resgate que vão consertar um veículo em caso de emergência. Como os carros são muito diferentes das motocicletas, há dois tipos diferentes de veículos de resgate. Um deles só sabe como resgatar carros e o outro só sabe como resgatar motocicletas.

Adicionando as classes
        SocorristaCarro

        SocorristaMoto

Adicionar métodos:
                SocorristaCarro → public void socorrer(Carro umCarro)

        SocorristaMoto → public void socorrer(Moto umaMoto)


Quando um socorrista se aproxima de um carro, ele imprime "Car Rescue" (Resgate de carro) e o número da placa na tela; ao resgatar uma motocicleta, ele imprime "Motorbike Rescue" (Resgate de motocicleta) e o número da placa na tela.


Adicione um socorrista de carro e um socorrista de motocicleta à classe de corrida.
Acrescente à corrida a responsabilidade de resgatar uma motocicleta e um carro:


public void socorrerCarro(String patente);

        public void socorrerMoto(String patente);