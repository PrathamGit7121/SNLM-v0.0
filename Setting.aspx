<%@ Page Title="" Language="C#" MasterPageFile="~/AdminMaster.Master" AutoEventWireup="true" CodeBehind="Setting.aspx.cs" Inherits="DMHS.Setting" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <section class="cnt-section">
        <div class="home-content">
            <div class="sales-boxes">

                <div class="top-sales box" style="width:450px; height: 450px;">
                    <div class="card">
                            <div class="card-header">
                                <h3>Dashboard</h3>
                            </div>
                            <div class="card-body">
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <asp:Label for="FirstName" ID="FirstNameLabe" Text="First Name" runat="server"></asp:Label>
                                        <asp:TextBox ID="FirstName" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="FirstName" ID="PswLabel" Text="Password" runat="server"></asp:Label>
                                        <asp:TextBox ID="Psw" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="UserID" ID="UserIDLabel" Text="User ID" runat="server"></asp:Label>
                                        <asp:TextBox ID="UserID" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <asp:Label for="ConPsw" ID="ConPswLabel" Text="Con. Password" runat="server"></asp:Label>
                                        <asp:TextBox ID="ConPsw" runat="server" CssClass="form-control"></asp:TextBox>
                                    </div>
                                </div>

                                <div class="form-row">
                                    <div class="form-group col-md-4">
                                        <asp:Label ID="SelRoleLabel" for="SelRole" runat="server" Text="Role"></asp:Label>
                                        <asp:DropDownList ID="SelRole" runat="server" CssClass="form-control">
                                            <asp:ListItem>choose one</asp:ListItem>
                                            <asp:ListItem>Admin</asp:ListItem>
                                            <asp:ListItem>User</asp:ListItem>
                                        </asp:DropDownList>
                                    </div>
                                </div>
                            </div>
                            <div class="card-footer text-center">
                                <asp:Button ID="SAVEButton" runat="server" Text="SAVE" CssClass="btn btn-primary" />
                                <asp:Button ID="DELETButton" runat="server" Text="DELETE" CssClass="btn btn-primary" />
                                <asp:Button ID="UPDATEButton" runat="server" Text="UPDATE" CssClass="btn btn-primary" />
                            </div>
                        </div>

                </div>

                <div class="recent-sales box">
                    <div class="card">
                        <div class="card-header">
                            <h3>Users Details</h3>
                        </div>
                        <div class="card-body">
                            <div class="sales-details">
                                <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" DataSourceID="SqlDataSource1" DataKeyNames="UserId">
                                    <Columns>
                                        <asp:BoundField DataField="UserId" HeaderText="UserId" SortExpression="UserId" ReadOnly="True" />
                                        <asp:BoundField DataField="Name" HeaderText="Name" SortExpression="Name" />
                                        <asp:BoundField DataField="Role" HeaderText="Role" SortExpression="Role" />
                                    </Columns>
                                </asp:GridView>


                                <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:LibraryInOutManagementSystemConnectionString %>" SelectCommand="SELECT [UserId], [Name], [Role] FROM [UserInfo]"></asp:SqlDataSource>


                            </div>


                        </div>
                    </div>


                </div>
            </div>
        </div>
    </section>
</asp:Content>
