DROP TABLE IF EXISTS products;

-- Create product table
CREATE TABLE products (
      id UUID PRIMARY KEY,
      product_id VARCHAR(50),
      name VARCHAR(100),
      description TEXT,
      price DOUBLE PRECISION,
      currency VARCHAR(1)
);

CREATE INDEX idx_productId ON products (product_id);

-- Data for product table
INSERT INTO products (id, product_id, name, description, price, currency) VALUES
     ('123e4567-e89b-12d3-a456-426614174000', 'shirt-302', 'Basic shirt', 'Basic shirt M', 20.0, '€'),
     ('123e4567-e89b-12d3-a456-426614174001', 'jumper-101', 'Beige trousers', 'Beige trousers XL', 50.0, '$');
