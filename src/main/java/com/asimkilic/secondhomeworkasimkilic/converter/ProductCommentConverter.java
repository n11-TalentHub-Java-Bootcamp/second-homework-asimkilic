package com.asimkilic.secondhomeworkasimkilic.converter;

import com.asimkilic.secondhomeworkasimkilic.dto.product.ProductWithCommentDto;
import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.CommentDto;
import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.NewCommentDto;
import com.asimkilic.secondhomeworkasimkilic.entity.ProductComment;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ProductCommentConverter {
    ProductCommentConverter INSTANCE = Mappers.getMapper(ProductCommentConverter.class);


   
    List<CommentDto> convertProductCommentListToCommentDtoList(List<ProductComment> productCommentList);

    @AfterMapping
    default void setNulls(@MappingTarget final CommentDto commentDto, ProductComment productComment) {
        if (commentDto.getUsername() == null) {
            commentDto.setUsername(productComment.getUser().getUsername());
        }
    }


    List<ProductWithCommentDto> convertProductCommentListToProductWithCommentDto(List<ProductComment> productCommentList);

    @AfterMapping
    default void setProductName(@MappingTarget final ProductWithCommentDto productWithCommentDto, ProductComment productComment) {
        if (productWithCommentDto.getProductName() == null) {

            productWithCommentDto.setProductComment(productComment.getComment());
            productWithCommentDto.setProductName(productComment.getProduct().getName());
        }
    }

    @Mapping(target = "product.id", source = "productId")
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "commentDate", expression = "java(new java.util.Date())")
    ProductComment convertNewCommentDtoToProductComment(NewCommentDto newCommentDto);

}
