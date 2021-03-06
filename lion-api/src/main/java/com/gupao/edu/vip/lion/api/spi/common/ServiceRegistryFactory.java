
package com.gupao.edu.vip.lion.api.spi.common;

import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;
import com.gupao.edu.vip.lion.api.srd.ServiceRegistry;

/**
 * Created by ohun on 2016/12/27.
 *
 * @author ohun@live.cn (夜色)
 */
public interface ServiceRegistryFactory extends Factory<ServiceRegistry> {
    static ServiceRegistry create() {
        return SpiLoader.load(ServiceRegistryFactory.class).get();
    }
}
