
CREATE TABLE pagamento_auditoria (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    pagamento_id bigint(20) NOT NULL,
    data_criacao varchar(100) DEFAULT NULL,
    sistema varchar(19) DEFAULT NULL,
    PRIMARY KEY (id)
  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
