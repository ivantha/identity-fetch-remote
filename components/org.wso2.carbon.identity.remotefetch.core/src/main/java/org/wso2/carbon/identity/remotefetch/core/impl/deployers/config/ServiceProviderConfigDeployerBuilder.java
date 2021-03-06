/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.remotefetch.core.impl.deployers.config;

import org.wso2.carbon.identity.remotefetch.common.configdeployer.ConfigDeployerBuilder;
import org.wso2.carbon.identity.remotefetch.common.configdeployer.ConfigDeployerBuilderException;

/**
 * Holds build function to build service provider config deployer.
 */
public class ServiceProviderConfigDeployerBuilder extends ConfigDeployerBuilder {

    /**
     * Build and return a new ConfigDeployer with the set configuration.
     *
     * @return
     * @throws ConfigDeployerBuilderException
     */
    @Override
    public ServiceProviderConfigDeployer build() throws ConfigDeployerBuilderException {

        return new ServiceProviderConfigDeployer(this.getFetchConfig().getTenantId(),
                this.getFetchConfig().getUserName(), this.getFetchConfig().getRemoteFetchConfigurationId());
    }
}
