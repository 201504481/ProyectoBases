-- Generado por Oracle SQL Developer Data Modeler 19.2.0.182.1216
--   en:        2019-09-21 04:35:32 CST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE agencia (
    idagencia   INTEGER NOT NULL,
    direccion   VARCHAR2(50),
    idbanco     INTEGER NOT NULL
);

ALTER TABLE agencia ADD CONSTRAINT agencia_pk PRIMARY KEY ( idagencia );

CREATE TABLE banco (
    idbanco   INTEGER NOT NULL,
    nombre    VARCHAR2(50)
);

ALTER TABLE banco ADD CONSTRAINT banco_pk PRIMARY KEY ( idbanco );

CREATE TABLE cheque (
    nocheque     INTEGER NOT NULL,
    fecha        DATE,
    monto        NUMBER,
    estado       VARCHAR2(10),
    nocuenta     INTEGER NOT NULL,
    nochequera   INTEGER NOT NULL
);

ALTER TABLE cheque ADD CONSTRAINT cheque_pk PRIMARY KEY ( nocheque );

CREATE TABLE cliente (
    idcliente   INTEGER NOT NULL,
    foto        BLOB,
    firma       VARCHAR2(250),
    nombre      VARCHAR2(100)
);

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( idcliente );

CREATE TABLE cuenta (
    nocuenta   INTEGER NOT NULL,
    estado     VARCHAR2(10),
    tipo       VARCHAR2(10),
    saldo      NUMBER
);

ALTER TABLE cuenta ADD CONSTRAINT cuenta_pk PRIMARY KEY ( nocuenta );

CREATE TABLE "Detalle_Cliente/Cuenta" (
    nocuenta    INTEGER NOT NULL,
    nocliente   INTEGER NOT NULL
);

CREATE TABLE "Detallle_Banco/Lote" (
    nochequera   INTEGER NOT NULL,
    idbanco      INTEGER NOT NULL
);

CREATE TABLE lote (
    nochequera   INTEGER NOT NULL,
    fecha        DATE,
    total        NUMBER,
    estado       VARCHAR2(10)
);

ALTER TABLE lote ADD CONSTRAINT lote_pk PRIMARY KEY ( nochequera );

CREATE TABLE rol (
    idrol    INTEGER NOT NULL,
    nombre   VARCHAR2(10)
);

ALTER TABLE rol ADD CONSTRAINT rol_pk PRIMARY KEY ( idrol );

CREATE TABLE solicitud_chequera (
    idsolicitud   INTEGER NOT NULL,
    estado        VARCHAR2(10),
    descripcion   VARCHAR2(50)
);

ALTER TABLE solicitud_chequera ADD CONSTRAINT solicitud_chequera_pk PRIMARY KEY ( idsolicitud );

CREATE TABLE transaccion (
    notransaccion   INTEGER NOT NULL,
    fecha           DATE,
    tipo            VARCHAR2(10),
    rechazo         CHAR(1),
    razonrechazo    VARCHAR2(100),
    saldoinicial    NUMBER,
    saldofinal      NUMBER,
    idagencia       INTEGER NOT NULL,
    idusuario       INTEGER NOT NULL,
    nocuentaa       INTEGER NOT NULL,
    nocheque        INTEGER NOT NULL,
    nocuentab       INTEGER NOT NULL
);

ALTER TABLE transaccion ADD CONSTRAINT transaccion_pk PRIMARY KEY ( notransaccion );

CREATE TABLE usuario (
    idusuario   INTEGER NOT NULL,
    nombre      VARCHAR2(50),
    password    VARCHAR2(100),
    idrol       INTEGER NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( idusuario );

ALTER TABLE agencia
    ADD CONSTRAINT agencia_banco_fk FOREIGN KEY ( idbanco )
        REFERENCES banco ( idbanco )
            ON DELETE CASCADE;

ALTER TABLE cheque
    ADD CONSTRAINT cheque_lote_fk FOREIGN KEY ( nochequera )
        REFERENCES lote ( nochequera )
            ON DELETE CASCADE;

ALTER TABLE "Detalle_Cliente/Cuenta"
    ADD CONSTRAINT table_14_cliente_fk FOREIGN KEY ( nocliente )
        REFERENCES cliente ( idcliente );

ALTER TABLE "Detalle_Cliente/Cuenta"
    ADD CONSTRAINT table_14_cuenta_fk FOREIGN KEY ( nocuenta )
        REFERENCES cuenta ( nocuenta );

ALTER TABLE "Detallle_Banco/Lote"
    ADD CONSTRAINT table_16_banco_fk FOREIGN KEY ( idbanco )
        REFERENCES banco ( idbanco );

ALTER TABLE "Detallle_Banco/Lote"
    ADD CONSTRAINT table_16_lote_fk FOREIGN KEY ( nochequera )
        REFERENCES lote ( nochequera );

ALTER TABLE transaccion
    ADD CONSTRAINT transaccion_agencia_fk FOREIGN KEY ( idagencia )
        REFERENCES agencia ( idagencia )
            ON DELETE CASCADE;

ALTER TABLE transaccion
    ADD CONSTRAINT transaccion_cheque_fk FOREIGN KEY ( nocheque )
        REFERENCES cheque ( nocheque )
            ON DELETE CASCADE;

ALTER TABLE transaccion
    ADD CONSTRAINT transaccion_cuenta_fk FOREIGN KEY ( nocuentaa )
        REFERENCES cuenta ( nocuenta )
            ON DELETE CASCADE;

ALTER TABLE transaccion
    ADD CONSTRAINT transaccion_cuenta_fkv2 FOREIGN KEY ( nocuentab )
        REFERENCES cuenta ( nocuenta );

ALTER TABLE transaccion
    ADD CONSTRAINT transaccion_usuario_fk FOREIGN KEY ( idusuario )
        REFERENCES usuario ( idusuario )
            ON DELETE CASCADE;

ALTER TABLE usuario
    ADD CONSTRAINT usuario_rol_fk FOREIGN KEY ( idrol )
        REFERENCES rol ( idrol )
            ON DELETE CASCADE;

CREATE SEQUENCE cu_nocuenta_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER cu_nocuenta_trg BEFORE
    INSERT ON cuenta
    FOR EACH ROW
    WHEN ( new.nocuenta IS NULL )
BEGIN
    :new.nocuenta := cu_nocuenta_seq.nextval;
END;
/

CREATE SEQUENCE banco_seq2 START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER banco_trg BEFORE
    INSERT ON BANCO
    FOR EACH ROW
    WHEN ( new.IDBANCO IS NULL )
BEGIN
    :new.IDBANCO := banco_seq2.nextval;
END;
/

CREATE SEQUENCE agencia_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER agencia_trg BEFORE
    INSERT ON AGENCIA
    FOR EACH ROW
    WHEN ( new.IDAGENCIA IS NULL )
BEGIN
    :new.IDAGENCIA := agencia_seq.nextval;
END;
/

CREATE SEQUENCE rol_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER rol_trg BEFORE
    INSERT ON ROL
    FOR EACH ROW
    WHEN ( new.IDROL IS NULL )
BEGIN
    :new.IDROL := rol_seq.nextval;
END;
/

INSERT INTO ROL VALUES (1, 'ADMIN');
INSERT INTO ROL VALUES (2, 'CLIENTE');
INSERT INTO USUARIO VALUES (1, 'ADMINISTRADOR', 'Grupo2', 1);
INSERT INTO USUARIO VALUES (2, 'JULIUS', 'Maxito15', 2);

commit;

Insert into BANCO(BANCO.nombre) VALUES ('Banco GT')

Insert into CLIENTE(cliente.idcliente, cliente.nombre, cliente.foto) VALUES (1, 'Julio', *  from openrowset )

-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            12
-- CREATE INDEX                             0
-- ALTER TABLE                             22
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           1
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          1
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
