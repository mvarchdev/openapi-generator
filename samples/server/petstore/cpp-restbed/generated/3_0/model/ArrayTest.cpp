/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.6.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ArrayTest.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

ArrayTest::ArrayTest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ArrayTest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ArrayTest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ArrayTest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Array_of_string
    tmp_node.clear();
	if (!m_Array_of_string.empty()) {
        tmp_node = toPt(m_Array_of_string);
		pt.add_child("array_of_string", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Array_array_of_integer
    tmp_node.clear();
	if (!m_Array_array_of_integer.empty()) {
        tmp_node = toPt(m_Array_array_of_integer);
		pt.add_child("array_array_of_integer", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Array_array_of_model
    tmp_node.clear();
	if (!m_Array_array_of_model.empty()) {
        tmp_node = toPt(m_Array_array_of_model);
		pt.add_child("array_array_of_model", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ArrayTest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Array_of_string into member
	if (pt.get_child_optional("array_of_string")) {
        m_Array_of_string = fromPt<std::vector<std::string>>(pt.get_child("array_of_string"));
	}
	// push all items of Array_array_of_integer into member
	if (pt.get_child_optional("array_array_of_integer")) {
        m_Array_array_of_integer = fromPt<std::vector<std::vector<int64_t>>>(pt.get_child("array_array_of_integer"));
	}
	// push all items of Array_array_of_model into member
	if (pt.get_child_optional("array_array_of_model")) {
        m_Array_array_of_model = fromPt<std::vector<std::vector<ReadOnlyFirst>>>(pt.get_child("array_array_of_model"));
	}
}

std::vector<std::string> ArrayTest::getArrayOfString() const
{
    return m_Array_of_string;
}

void ArrayTest::setArrayOfString(std::vector<std::string> value)
{
    m_Array_of_string = value;
}


std::vector<std::vector<int64_t>> ArrayTest::getArrayArrayOfInteger() const
{
    return m_Array_array_of_integer;
}

void ArrayTest::setArrayArrayOfInteger(std::vector<std::vector<int64_t>> value)
{
    m_Array_array_of_integer = value;
}


std::vector<std::vector<ReadOnlyFirst>> ArrayTest::getArrayArrayOfModel() const
{
    return m_Array_array_of_model;
}

void ArrayTest::setArrayArrayOfModel(std::vector<std::vector<ReadOnlyFirst>> value)
{
    m_Array_array_of_model = value;
}



std::vector<ArrayTest> createArrayTestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ArrayTest>();
    for (const auto& child: pt) {
        vec.emplace_back(ArrayTest(child.second));
    }

    return vec;
}

}
}
}
}

