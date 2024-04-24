# NOTE: This file is auto generated by OpenAPI Generator 7.6.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.FormatTest do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :integer,
    :int32,
    :int64,
    :number,
    :float,
    :double,
    :decimal,
    :string,
    :byte,
    :binary,
    :date,
    :dateTime,
    :uuid,
    :password,
    :pattern_with_digits,
    :pattern_with_digits_and_delimiter
  ]

  @type t :: %__MODULE__{
    :integer => integer() | nil,
    :int32 => integer() | nil,
    :int64 => integer() | nil,
    :number => float(),
    :float => float() | nil,
    :double => float() | nil,
    :decimal => String.t | nil,
    :string => String.t | nil,
    :byte => binary(),
    :binary => String.t | nil,
    :date => Date.t,
    :dateTime => DateTime.t | nil,
    :uuid => String.t | nil,
    :password => String.t,
    :pattern_with_digits => String.t | nil,
    :pattern_with_digits_and_delimiter => String.t | nil
  }

  alias OpenapiPetstore.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:date, :date, nil)
     |> Deserializer.deserialize(:dateTime, :datetime, nil)
  end
end

