# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: recommender.proto for package 'recommender'

require 'grpc'
require 'recommender_pb'

module Recommender
  module MovieRecommender
    # The greeting service definition.
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'recommender.MovieRecommender'

      rpc :RecommendMovie, Profile, Recommendations
      rpc :getAllMovies, Google::Protobuf::Empty, Recommendations
      rpc :streamNewMovies, Google::Protobuf::Empty, stream(Movie)
    end

    Stub = Service.rpc_stub_class
  end
end
