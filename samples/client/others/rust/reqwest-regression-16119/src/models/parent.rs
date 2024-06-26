/*
 * double-option-hashmap
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct Parent {
    #[serde(rename = "child", skip_serializing_if = "Option::is_none")]
    pub child: Option<std::collections::HashMap<String, serde_json::Value>>,
}

impl Parent {
    pub fn new() -> Parent {
        Parent {
            child: None,
        }
    }
}

