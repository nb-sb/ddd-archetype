#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 监听服务；在单体服务中，解耦流程。类似MQ的使用，如Spring的Event，Guava的事件总线都可以。如果使用了 Redis 那么也可以有发布/订阅使用。
 */
package ${package}.trigger.listener;
