INSERT INTO tb_category(name) VALUES ('livros');
INSERT INTO tb_category(name) VALUES ('Eletrônicos');

INSERT INTO tb_product(name, description, price, img_url) VALUES ('senhor dos aneis', 'livro muito bom', 200.0, 'http://livros.com');

INSERT INTO tb_product_category(product_id, category_id) VALUES (1,1);