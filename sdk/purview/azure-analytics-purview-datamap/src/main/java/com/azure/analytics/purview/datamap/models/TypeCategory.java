// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type Category.
 */
public final class TypeCategory extends ExpandableStringEnum<TypeCategory> {
    /**
     * primitive.
     */
    @Generated
    public static final TypeCategory PRIMITIVE = fromString("PRIMITIVE");

    /**
     * object id type.
     */
    @Generated
    public static final TypeCategory OBJECT_ID_TYPE = fromString("OBJECT_ID_TYPE");

    /**
     * enum.
     */
    @Generated
    public static final TypeCategory ENUM = fromString("ENUM");

    /**
     * struct.
     */
    @Generated
    public static final TypeCategory STRUCT = fromString("STRUCT");

    /**
     * classification.
     */
    @Generated
    public static final TypeCategory CLASSIFICATION = fromString("CLASSIFICATION");

    /**
     * entity.
     */
    @Generated
    public static final TypeCategory ENTITY = fromString("ENTITY");

    /**
     * array.
     */
    @Generated
    public static final TypeCategory ARRAY = fromString("ARRAY");

    /**
     * map.
     */
    @Generated
    public static final TypeCategory MAP = fromString("MAP");

    /**
     * relationship.
     */
    @Generated
    public static final TypeCategory RELATIONSHIP = fromString("RELATIONSHIP");

    /**
     * term template.
     */
    @Generated
    public static final TypeCategory TERM_TEMPLATE = fromString("TERM_TEMPLATE");

    /**
     * Creates a new instance of TypeCategory value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public TypeCategory() {
    }

    /**
     * Creates or finds a TypeCategory from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TypeCategory.
     */
    @Generated
    @JsonCreator
    public static TypeCategory fromString(String name) {
        return fromString(name, TypeCategory.class);
    }

    /**
     * Gets known TypeCategory values.
     * 
     * @return known TypeCategory values.
     */
    @Generated
    public static Collection<TypeCategory> values() {
        return values(TypeCategory.class);
    }
}
