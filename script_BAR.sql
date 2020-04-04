--CLIENTE

INSERT INTO `dbbar`.`tcliente` (`id`, `genero`, `idade`, `nome`) VALUES ('1', 'MASCULINO', '31', 'JOÃO');

--PEDIDO

INSERT INTO `dbbar`.`tpedido` (`id`, `descricao`, `id_cliente`) VALUES ('1', 'MESA 11', '1');

--PRODUTO

INSERT INTO `dbbar`.`tproduto` (`id`, `nome`, `preco`, `quantidade`, `id_pedido`) VALUES ('1', 'CERVEJA', '11', '1', '1');
INSERT INTO `dbbar`.`tproduto` (`id`, `nome`, `preco`, `quantidade`, `id_pedido`) VALUES ('2', 'GURJÃO', '50', '1', '1');
INSERT INTO `dbbar`.`tproduto` (`id`, `nome`, `preco`, `quantidade`, `id_pedido`) VALUES ('3', 'PUDIM', '5', '1', '1');

--BEBIDA

INSERT INTO `dbbar`.`tbebida` (`marca`, `tamanho`, `tipo`, `id_produto`) VALUES ('SKOL', '600', 'alcoólico', '1');

--PETISCO

INSERT INTO `dbbar`.`tpetisco` (`is_feito_hoje`, `tipo`, `validade`, `id_produto`) VALUES (FALSE,'CARNE', '2020-04-02 11:15:56', 2);

--SOBREMESA

INSERT INTO `dbbar`.`tsobremesa` (`is_feito_hone`, `tamanho`, `validade`, `id_produto`) VALUES (false, 'PEQUENO', '2020-04-02 11:15:56',3);



INSERT INTO `dbbar`.`tcliente` (`id`, `genero`, `idade`, `nome`) VALUES ('1', 'MASCULINO', '31', 'JOÃO');

INSERT INTO `dbbar`.`tpedido` (`id`, `descricao`, `id_cliente`) VALUES ('1', 'MESA 11', '1');

INSERT INTO `dbbar`.`tproduto` (`id`, `nome`, `preco`, `quantidade`, `id_pedido`) VALUES ('1', 'CERVEJA', '11', '1', '1');
INSERT INTO `dbbar`.`tproduto` (`id`, `nome`, `preco`, `quantidade`, `id_pedido`) VALUES ('2', 'GURJÃO', '50', '1', '1');
INSERT INTO `dbbar`.`tproduto` (`id`, `nome`, `preco`, `quantidade`, `id_pedido`) VALUES ('3', 'PUDIM', '5', '1', '1');

INSERT INTO `dbbar`.`tbebida` (`marca`, `tamanho`, `tipo`, `id_produto`) VALUES ('SKOL', '600', 'alcoólico', '1');

INSERT INTO `dbbar`.`tpetisco` (`is_feito_hoje`, `tipo`, `validade`, `id_produto`) VALUES (FALSE,'CARNE', '2020-04-02 11:15:56', 2);


INSERT INTO `dbbar`.`tsobremesa` (`is_feito_hone`, `tamanho`, `validade`, `id_produto`) VALUES (false, 'PEQUENO', '2020-04-02 11:15:56',3);
