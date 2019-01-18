package com.sadad.jib.domain;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
@Data
public class Category {

    @Id
    private ObjectId id;

    private String categoryName;
    private String categoryParent;
}
