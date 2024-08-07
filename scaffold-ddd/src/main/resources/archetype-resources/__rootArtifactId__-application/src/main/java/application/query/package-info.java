#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 查询应用服务
 * 纯DB查询直接在查询应用服务中处理即可，查询逻辑涉及到SQL，ES,Redis等多个存储介质的则使用查询仓储
 */
package ${package}.application.query;
