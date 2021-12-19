package com.asimkilic.secondhomeworkasimkilic.converter;

import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.CommentDto;
import com.asimkilic.secondhomeworkasimkilic.entity.ProductComment;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ProductCommentConverter {
    ProductCommentConverter INSTANCE = Mappers.getMapper(ProductCommentConverter.class);

    // Convert Entity To DTO
    @Mapping(target = "username", source = "user.getUsername()")
    List<CommentDto> convertProductCommentListToCommentDtoList(List<ProductComment> productCommentList);

    @AfterMapping
    default void setNulls(@MappingTarget final CommentDto commentDto, ProductComment productComment) {
        if (commentDto.getUsername() == null) {
            commentDto.setUsername(productComment.getUser().getUsername());
        }
    }
}
