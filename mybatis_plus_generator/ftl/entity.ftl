package ${basePackageMap['model'].packageName};

import lombok.Data;
import com.mybatis_plus_generator.common.domain.po.BaseModel;

/**
* ${tableComment!}
* @author ${author!}
* @date ${.now?string("yyyy-MM-dd HH:mm:ss")}
**/
@Data
@TableName("${tableName}")
public class ${basePackageMap['model'].className} extends BaseModel {

<#list entityAttrs as ea>
    /**
    * ${ea.comment!}
    */
    <#if ea.isPrimaryKey == "1">
        @TableId
    </#if>
    <#if ea.isPrimaryKey != "1">
        @TableField("${ea.jdbcFieldName}")
    </#if>
    private ${ea.javaType} ${ea.fieldName};
</#list>

}
