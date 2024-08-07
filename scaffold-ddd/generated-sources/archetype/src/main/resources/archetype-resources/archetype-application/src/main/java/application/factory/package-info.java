#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 应用层工厂包
 * <p>
 * 复杂逻辑使用工厂类的方式去新建聚合。
 * 比如聚合的属性需要其他领域或者三方服务提供接口才能获取到，这种形式则使用领域服务做。
 * <p>
 * Factory可以被申明为一个bean，去依赖应用服务或者适配器
 * <p>
 * 从上面的角度来看，工厂本身并不是领域的一部分，它只是用来创造聚合
 * 当然有的人也把这个认为是领域的一部分，把factory这个包放在domain的包下，然后使用
 * 与lombok类似的builder方式对新建聚合做一层工具类的包装。我觉得太繁琐，为了形式而形式
 * 没必要，大多数场景下直接通过command的toDomain方法即可得到聚合，少数复杂聚合才需要工厂包装
 *
 */
package ${package}.application.factory;
