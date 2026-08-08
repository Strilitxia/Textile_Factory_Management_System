package com.example.textile_factory_management_system.NonUser;

import java.io.Serializable;

public class ProductReview implements Serializable {
    private int reviewId, customerId, ratingStars;
    private String comment, productType;

    public ProductReview(int reviewId, String productType, int customerId, int ratingStars, String comment) {
        this.reviewId = reviewId;
        this.productType = productType;
        this.customerId = customerId;
        this.ratingStars = ratingStars;
        this.comment = comment;
    }

}
