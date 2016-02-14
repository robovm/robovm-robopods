/*
 * Copyright (C) 2016 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.billing;

import java.util.ArrayList;
import java.util.List;

public final class ProductCatalog {
    private List<Product> products = new ArrayList<>();

    private ProductCatalog() {}

    public Product getProduct(String identifier) {
        return getProduct(null, identifier);
    }

    public Product getProduct(StoreType type, String identifier) {
        for (Product product : products) {
            if (identifier.equals(product.getIdentifier(type))) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static final class Builder {
        private ProductCatalog instance;

        private Product currentProduct;

        public Builder() {
            instance = new ProductCatalog();
        }

        public Builder newProduct() {
            currentProduct = new Product();
            instance.products.add(currentProduct);
            return this;
        }

        public Builder newProduct(String identifier) {
            currentProduct = new Product(identifier);
            instance.products.add(currentProduct);
            return this;
        }

        public Builder setType(ProductType type) {
            throwExceptionIfNullProduct();
            currentProduct.setType(type);
            return this;
        }

        public Builder addIdentifier(StoreType store, String identifier) {
            throwExceptionIfNullProduct();
            currentProduct.addIdentifier(store, identifier);
            return this;
        }

        public Builder setTitle(String title) {
            throwExceptionIfNullProduct();
            currentProduct.setTitle(title);
            return this;
        }

        public Builder setDescription(String description) {
            throwExceptionIfNullProduct();
            currentProduct.setDescription(description);
            return this;
        }

        public Builder setPrice(double price, String currency) {
            throwExceptionIfNullProduct();
            currentProduct.setPrice(price, currency);
            return this;
        }

        public ProductCatalog build() {
            if (instance.products.size() == 0) {
                throw new UnsupportedOperationException("Need to add at least 1 product!");
            }
            return instance;
        }

        private void throwExceptionIfNullProduct() {
            if (currentProduct == null) {
                throw new UnsupportedOperationException("Cannot modify null product! Need to call newProduct() first.");
            }
        }
    }
}
