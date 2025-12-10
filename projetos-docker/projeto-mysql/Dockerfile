# Começamos a partir da imagem oficial
FROM mysql:8.0
# Copiamos um script SQL da nossa pasta para dentro do container
# O MySQL executa automaticamente scripts nesta pasta ao iniciar
#  pela primeira vez
COPY ./script-inicial.sql /docker-entrypoint-initdb.d/
# Definimos variáveis de ambiente padrão (opcional)
ENV MYSQL_ROOT_PASSWORD=senha-secreta