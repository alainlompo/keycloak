/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2016 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.authorization.admin.representation;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author <a href="mailto:psilva@redhat.com">Pedro Igor</a>
 */
public class PolicyEvaluationRequest {

    private Map<String, Map<String, String>> context;
    private List<Resource> resources;
    private String clientId;
    private String userId;
    private List<String> roleIds;
    private boolean entitlements;

    public Map<String, Map<String, String>> getContext() {
        return this.context;
    }

    public void setContext(Map<String, Map<String, String>> context) {
        this.context = context;
    }

    public List<Resource> getResources() {
        return this.resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getRoleIds() {
        return this.roleIds;
    }

    public void setRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
    }

    public boolean isEntitlements() {
        return entitlements;
    }

    public void setEntitlements(boolean entitlements) {
        this.entitlements = entitlements;
    }

    public static class Resource {
        private String id;
        private String name;
        private String type;
        private Set<String> scopes;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(final String type) {
            this.type = type;
        }

        public Set<String> getScopes() {
            return scopes;
        }

        public void setScopes(final Set<String> scopes) {
            this.scopes = scopes;
        }
    }
}
