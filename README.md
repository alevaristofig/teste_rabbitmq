Baixar o projeto para sua maquina.
Acessar o diretório docker e executar o comando docker compose up
Ir para o diretório raiz da projeto e executar os comandos
docker image build -t <nome> .
docker container run -p 8080:8080 --network testepetize-network(nome-rede) <nome_imagem> 
