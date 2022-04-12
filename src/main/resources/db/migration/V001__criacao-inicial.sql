create TABLE cozinha (
    id BIGINT NOT NULL auto_increment,
    nome VARCHAR(60) NOT NULL,
    PRIMARY KEY (id)
) engine=innodb DEFAULT charset=utf8;