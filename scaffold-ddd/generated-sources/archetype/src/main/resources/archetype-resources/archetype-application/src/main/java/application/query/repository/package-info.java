#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 查询仓储
 * 注意区分领域模型对应的仓储，查询仓储仅仅为了对应用服务查询时屏蔽存储介质
 * 在跨存储介质存储时才需要查询仓储
 *
 */
package ${package}.application.query.repository;
