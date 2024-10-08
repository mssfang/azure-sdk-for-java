// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ExpressionV2;
import com.azure.resourcemanager.datafactory.models.ExpressionV2Type;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ExpressionV2Tests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExpressionV2 model = BinaryData.fromString(
            "{\"type\":\"Unary\",\"value\":\"axehiegkpukva\",\"operators\":[\"lbqhtiijlikio\",\"dtdekmwzs\"],\"operands\":[{\"type\":\"Binary\",\"value\":\"jsmkhk\",\"operators\":[\"ccd\",\"siizadmbn\",\"yswpnoghkhzwfns\",\"uwttrvgzjfptprfq\"],\"operands\":[{\"type\":\"Binary\",\"value\":\"ndzvtfkdzqt\",\"operators\":[\"yjqbezv\",\"ebdhpizk\",\"qkylmfy\",\"iodcgwbkfcajtxzd\"],\"operands\":[{},{},{},{}]},{\"type\":\"Binary\",\"value\":\"ng\",\"operators\":[\"aexewftqo\",\"fvjfaqah\",\"eskdsbp\"],\"operands\":[{},{},{},{}]},{\"type\":\"Field\",\"value\":\"b\",\"operators\":[\"xjucojzjr\",\"ppvdhklcczgflo\",\"zst\"],\"operands\":[{}]}]},{\"type\":\"Field\",\"value\":\"afrbuvwugww\",\"operators\":[\"xhvesoodxmmty\",\"mejpqxuiodwbla\"],\"operands\":[{\"type\":\"Binary\",\"value\":\"dvceuyw\",\"operators\":[\"t\",\"lcvokvoqjb\",\"dyoc\"],\"operands\":[{},{},{}]}]}]}")
            .toObject(ExpressionV2.class);
        Assertions.assertEquals(ExpressionV2Type.UNARY, model.type());
        Assertions.assertEquals("axehiegkpukva", model.value());
        Assertions.assertEquals("lbqhtiijlikio", model.operators().get(0));
        Assertions.assertEquals(ExpressionV2Type.BINARY, model.operands().get(0).type());
        Assertions.assertEquals("jsmkhk", model.operands().get(0).value());
        Assertions.assertEquals("ccd", model.operands().get(0).operators().get(0));
        Assertions.assertEquals(ExpressionV2Type.BINARY, model.operands().get(0).operands().get(0).type());
        Assertions.assertEquals("ndzvtfkdzqt", model.operands().get(0).operands().get(0).value());
        Assertions.assertEquals("yjqbezv", model.operands().get(0).operands().get(0).operators().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExpressionV2 model = new ExpressionV2().withType(ExpressionV2Type.UNARY)
            .withValue("axehiegkpukva")
            .withOperators(Arrays.asList("lbqhtiijlikio", "dtdekmwzs"))
            .withOperands(Arrays.asList(
                new ExpressionV2().withType(ExpressionV2Type.BINARY)
                    .withValue("jsmkhk")
                    .withOperators(Arrays.asList("ccd", "siizadmbn", "yswpnoghkhzwfns", "uwttrvgzjfptprfq"))
                    .withOperands(Arrays.asList(
                        new ExpressionV2().withType(ExpressionV2Type.BINARY)
                            .withValue("ndzvtfkdzqt")
                            .withOperators(Arrays.asList("yjqbezv", "ebdhpizk", "qkylmfy", "iodcgwbkfcajtxzd"))
                            .withOperands(Arrays.asList(new ExpressionV2(), new ExpressionV2(), new ExpressionV2(),
                                new ExpressionV2())),
                        new ExpressionV2().withType(ExpressionV2Type.BINARY)
                            .withValue("ng")
                            .withOperators(Arrays.asList("aexewftqo", "fvjfaqah", "eskdsbp"))
                            .withOperands(Arrays.asList(new ExpressionV2(), new ExpressionV2(), new ExpressionV2(),
                                new ExpressionV2())),
                        new ExpressionV2().withType(ExpressionV2Type.FIELD)
                            .withValue("b")
                            .withOperators(Arrays.asList("xjucojzjr", "ppvdhklcczgflo", "zst"))
                            .withOperands(Arrays.asList(new ExpressionV2())))),
                new ExpressionV2().withType(ExpressionV2Type.FIELD)
                    .withValue("afrbuvwugww")
                    .withOperators(Arrays.asList("xhvesoodxmmty", "mejpqxuiodwbla"))
                    .withOperands(Arrays.asList(new ExpressionV2().withType(ExpressionV2Type.BINARY)
                        .withValue("dvceuyw")
                        .withOperators(Arrays.asList("t", "lcvokvoqjb", "dyoc"))
                        .withOperands(Arrays.asList(new ExpressionV2(), new ExpressionV2(), new ExpressionV2()))))));
        model = BinaryData.fromObject(model).toObject(ExpressionV2.class);
        Assertions.assertEquals(ExpressionV2Type.UNARY, model.type());
        Assertions.assertEquals("axehiegkpukva", model.value());
        Assertions.assertEquals("lbqhtiijlikio", model.operators().get(0));
        Assertions.assertEquals(ExpressionV2Type.BINARY, model.operands().get(0).type());
        Assertions.assertEquals("jsmkhk", model.operands().get(0).value());
        Assertions.assertEquals("ccd", model.operands().get(0).operators().get(0));
        Assertions.assertEquals(ExpressionV2Type.BINARY, model.operands().get(0).operands().get(0).type());
        Assertions.assertEquals("ndzvtfkdzqt", model.operands().get(0).operands().get(0).value());
        Assertions.assertEquals("yjqbezv", model.operands().get(0).operands().get(0).operators().get(0));
    }
}
